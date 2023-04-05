from smtplib import *
from dotenv.main import load_dotenv
from email.mime.text import *
from email.mime.multipart import *
import os

load_dotenv()
password = os.environ["EmailPass"]

mess = MIMEMultipart()
mess['From'] = "patel.raj.official.96@gmail.com"
mess['To'] = 'rajp08367@gmail.com'
mess['Subject'] = 'Testing Mutlipart Mail'

body = "This was a Test for Mail with Subject"

mess.attach(MIMEText(body, "plain"))

server = SMTP('smtp.gmail.com', 587)
server.starttls()
server.login('patel.raj.official.96@gmail.com', password)

text = mess.as_string()
server.sendmail("patel.raj.official.96@gmail.com", 'safumaster92@gmail.com', text)
server.quit()