from selenium import webdriver
import os
import time
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file="file:///" + os.path.abspath("C:/Users/21173/Desktop/pyhtml/alert.html")
driver.get(file)
# driver.maximize_window()

driver.find_element_by_id("tooltip").click()
time.sleep(2)

alert = driver.switch_to.alert
alert.accept()

time.sleep(2)
driver.quit()