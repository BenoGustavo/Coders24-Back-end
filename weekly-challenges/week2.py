def week2(listOfValues: list[str]) -> str:
    max_time = 0

    # Return the first item in alphabetical order from a sorted list of items that have the maximum count in listOfValues.
    return sorted(
        [
            # Iterate over each item in listOfValues.
            item
            for item in listOfValues
            # Use a walrus operator to assign the count of the current item to max_time (though max_time is not used effectively here) and check if it equals the maximum count of any item in listOfValues.
            if (max_time := listOfValues.count(item))
            # Compare the count of the current item to the maximum count found by iterating over listOfValues and counting each item.
            == max(listOfValues.count(item) for item in listOfValues)
        ]
        # Sort the list of items that have the maximum count and return the first item in alphabetical order.
    )[0]


lista_A = ["apple", "banana", "apple", "orange", "banana", "apple", "banana"]

print(week2(lista_A))
