from selenium import webdriver
import os
import time
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file="file:///" + os.path.abspath("C:/Users/21173/Desktop/pyhtml/level_locate.html")
driver.get(file)
driver.maximize_window()
time.sleep(2)
driver.find_element_by_link_text("Link1").click()

ele = driver.find_element_by_id("dropdown1").find_element_by_link_text("Another action")

ActionChains(driver).move_to_element(ele).perform()

time.sleep(2)

driver.quit()