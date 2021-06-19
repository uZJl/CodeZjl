from selenium import webdriver
import os
import time
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file="file:///" + os.path.abspath("C:/Users/21173/Desktop/pyhtml/send.html")
driver.get(file)
time.sleep(2)

driver.find_element_by_tag_name("input").click()
time.sleep(2)

alert = driver.switch_to.alert
alert.send_keys("ZJL")
time.sleep(2)

alert.accept()

time.sleep(2)
driver.quit()


