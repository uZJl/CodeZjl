from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("http://localhost:8080/DBed/index.html")
driver.maximize_window()
time.sleep(3)
driver.find_element_by_xpath("//*[@id='container']/div[5]/button").click()
time.sleep(3)
alert=driver.switch_to.alert
alert.accept()
time.sleep(3)
alert1=driver.switch_to.alert
alert1.accept()
time.sleep(3)
driver.quit()