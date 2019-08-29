=================================================================================
При выполнении задания необходимо использовать возможности Selenium WebDriver,
юнит-тест фреймворка и концепцию Page Object. Автоматизировать следующий сценарий:

1. Открыть https://cloud.google.com/
2. Нажать на кнопку EXPLORE ALL PRODUCTS
3. Нажать на кнопку SEE PRICING
4. В панели слева выбрать Calculators

5. Активировать раздел COMPUTE ENGINE вверху страницы
6. Заполнить форму следующими данными:
    * Number of instances: 4
    * What are these instances for?: оставить пустым
    * Operating System / Software: Free: Debian, CentOS, CoreOS, Ubuntu, or other
    User Provided OS
    * VM Class: Regular
    * Instance type: n1-standard-8    (vCPUs: 8, RAM: 30 GB)
    * Выбрать Add GPUs
        * Number of GPUs: 1
        * GPU type: NVIDIA Tesla V100
    * Local SSD: 2x375 Gb
    * Datacenter location: Frankfurt (europe-west3)
    * Commited usage: 1 Year
7. Нажать Add to Estimate
8. Проверить соответствие данных следующих полей: VM Class, Instance type, Region,
 local SSD, commitment term
9. Проверить что сумма аренды в месяц совпадает с суммой получаемой при ручном
прохождении теста.

=================================================================================