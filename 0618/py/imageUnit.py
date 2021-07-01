from selenium import webdriver
import unittest
import time

class imageTest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.url = "http://localhost:8080/DBed/index.html"
        self.driver.maximize_window()
        time.sleep(3)
    def tearDown(self):
        self.driver.quit()

    def test_upload(self):
        driver = self.driver
        driver.get(self.url)
        time.sleep(3)
        driver.find_element_by_xpath("//*[@id='blog-collapse']/form/div[1]/input").send_keys("E:\\JavaCode\\DrawingBed\\TmpPictures\\666.jpeg")
        time.sleep(3)
        driver.find_element_by_xpath("//*[@id='blog-collapse']/form/div[2]/input").click()
        time.sleep(3)

    def test_delete(self):
        driver = self.driver
        driver.get(self.url)
        time.sleep(3)
        driver.find_element_by_xpath("//*[@id='container']/div[5]/button").click()
        time.sleep(3)
        alert = driver.switch_to.alert
        alert.accept()
        time.sleep(3)
        alert1 = driver.switch_to.alert
        alert1.accept()
        time.sleep(3)

        if __name__=="__main__":
            unittest.main(verbosity=0)





