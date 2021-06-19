from selenium import webdriver

driver = webdriver.Chrome()
url = "https://www.baidu.com"
driver.get(url)

driver.find_element_by_id("kw")
driver.find_element_by_id("su").click()

driver.quit()