import requests
from bs4 import BeautifulSoup
from smtplib import SMTP

header = {
    "Accept-Language": "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) "
                  "Chrome/93.0.4577.82 Safari/537.36 "
}
link = "https://www.amazon.in/dp/B08N5W4NNB/ref=fs_a_mn_0"
response = requests.get(url=link, headers=header)
data = response.content

soup = BeautifulSoup(data, "lxml")
price = soup.find(id="priceblock_ourprice").text
price_without_currency_symbol = price.split("₹")[1]
float_price_with_comma = price_without_currency_symbol.split(",")
price_without_comma = ""

for num in float_price_with_comma:
    price_without_comma += num
float_price_without_comma = float(price_without_comma)

product_title = soup.find(id="productTitle").text.strip()

if float_price_without_comma < 84000:
    with SMTP(host="smtp.gmail.com", port="587") as connection:
        connection.starttls()
        connection.login(user="k.balaganesh26@gmail.com", password="bala2003")
        connection.sendmail(from_addr="k.balaganesh26@gmail.com",
                            to_addrs="k.balaganesh26@gmail.com",
                            msg=f"subject:Price Drop alert!!()\n\n{product_title}\n{link}")