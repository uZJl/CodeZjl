from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("http://localhost:8080/DBed/index.html")
driver.maximize_window()
time.sleep(3)
driver.find_element_by_xpath("//*[@id='blog-collapse']/form/div[1]/input").send_keys("E:\\JavaCode\\DrawingBed\\TmpPictures\\666.jpeg")
driver.find_element_by_xpath("//*[@id='blog-collapse']/form/div[2]/input").click()
time.sleep(3)

driver.quit()