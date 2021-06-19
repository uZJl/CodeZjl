from selenium import webdriver
import os
import time
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file="file:///" + os.path.abspath("C:/Users/21173/Desktop/pyhtml/modal.html")
driver.get(file)
time.sleep(2)

driver.find_element_by_link_text("Click").click()
time.sleep(2)

div0 = driver.find_element_by_class_name("modal-body")
div0.find_element_by_id("click").click()
time.sleep(2)

div1 = driver.find_element_by_class_name("modal-footer")
# div1.find_element_by_class_name("btn").click()
buttoms = div1.find_elements_by_tag_name("button")
buttoms[0].click()

time.sleep(2)
driver.quit()