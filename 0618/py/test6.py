from selenium import webdriver
import os
import time
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file="file:///" + os.path.abspath("C:/Users/21173/Desktop/pyhtml/upload.html")
driver.get(file)
time.sleep(2)

driver.find_element_by_tag_name("input").send_keys("C:/Users/21173/Desktop/pyhtml/1111.jpg")

time.sleep(2)
driver.quit()