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
    def 