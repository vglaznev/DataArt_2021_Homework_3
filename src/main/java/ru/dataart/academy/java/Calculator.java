package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        Iterator<Integer> iteratorFirstNumber = firstNumber.iterator();
        Iterator<Integer> iteratorSecondNumber = secondNumber.iterator();

        return getReversedNumber(iteratorFirstNumber) + getReversedNumber(iteratorSecondNumber);
    }

    private Integer getReversedNumber(Iterator<Integer> iterator) {
        Integer reversedNumber = 0, decimalPlace = 1;

        while (iterator.hasNext()) {
            reversedNumber += iterator.next() * decimalPlace;
            decimalPlace *= 10;
        }

        return reversedNumber;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> oddPositionList = new ArrayList<T>();
        for (int i = 0; i < list.size(); i += 2) {
            oddPositionList.add(list.get(i));
        }
        return oddPositionList;
    }

    /**
     * @param list - list of elements
     * @param <T>  - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> listOfFirstAndLastElement = new ArrayList<T>();
        if (list.size() > 1) {
            listOfFirstAndLastElement = Arrays.asList(list.get(0), list.get(list.size() - 1));
        } else if (list.size() == 1) {
            listOfFirstAndLastElement = Arrays.asList(list.get(0));
        }
        return listOfFirstAndLastElement;
    }
}
