from selenium import webdriver
import os
import time
from selenium.webdriver.common.action_chains import ActionChains

driver = webdriver.Chrome()
file="file:///" + os.path.abspath("C:/Users/21173/Desktop/pyhtml/drop_down.html")
driver.get(file)
# driver.maximize_window()
time.sleep(2)

# driver.find_element_by_xpath("//*[@id='ShippingMethod']/option[3]").click()
# driver.find_element_by_css_selector("#ShippingMethod > option:nth-child(4)").click()
options = driver.find_element_by_id("ShippingMethod").find_elements_by_tag_name("option")
# for option in options:
#     if option.get_attribute('value') == '10.69':
#         option.click()
options[2].click()

time.sleep(2)
driver.quit()