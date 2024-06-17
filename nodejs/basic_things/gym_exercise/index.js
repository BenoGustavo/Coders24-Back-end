/*
What needs to be done:
1. Create User
2 Search User by email
3. Add a sport to a user
4. Remove User
*/


// User Object
// {
//     name: "Lorem Ipsum",
//         email: "Lorem Ipsum",
//             sports: ["Lorem", "Ipsum", "Dolor"],
// }

const prompt = require("prompt-sync")()

let whantToContinue = true
let users = []

let userEmail = ""
let name = ""

while (whantToContinue) {

    console.log("Welcome to the User Management System\n")
    console.log("Select a option:\n0. Exit\n1. Create a new User\n2. Search User by email\n3. Add a sport to a user\n4. Remove User\n")
    const option = prompt()

    switch (option) {
        case "0":
            console.log("Exiting...")
            whantToContinue = false
            break
        case "1":
            console.log("\nCreating a new User...")

            name = prompt("Enter the user name: ")
            userEmail = prompt("Enter the user email: ")

            users.push({
                name: name,
                email: userEmail,
                sports: []
            })

            console.clear();

            console.log("User " + name + " created successfully\n\n")

            break
        case "2":
            if (users.length === 0) {
                console.clear();
                console.log("There are no users to search for\n\n")
                break
            }

            console.clear();

            let email = prompt("Enter the user email to search for: ")

            let findedUser = users.reduce((user) => user.email.toLowerCase() === email.toLowerCase())

            if (findedUser) {
                console.clear();
                console.log("User found: ", findedUser, "\n\n")
                break
            }

            console.clear();
            console.log("User not found\n\n")

            break
        case "3":
            if (users.length === 0) {
                console.clear()
                console.log("There are no users to add a sport to\n\n")
                break
            }

            let found = false

            console.clear()
            console.log("Adding a sport to a user...")

            userEmail = prompt("Enter the user email: ")

            let sportToAdd = prompt("Enter the sport to add: ")

            users = users.map((user) => {
                if (user.email === userEmail) {
                    user.sports.push(sportToAdd)
                    found = true
                }
                return user
            })

            console.clear()

            if (!found) {
                console.log("User not found\n\n")
                break
            }

            console.clear()
            console.log("Sport " + sportToAdd + " added to user " + userEmail + " successfully\n\n")

            break
        case "4":
            if (users.length === 0) {
                console.clear()
                console.log("There are no users to remove\n\n")
                break
            }

            console.clear()
            console.log("Removing a user...")

            userEmail = prompt("Enter the user email: ")

            let userIndex = users.findIndex((user) => user.email === userEmail)

            users.splice(userIndex, 1)

            console.clear()

            console.log("sucessfully removed user\n\n")

            break
        default:
            console.clear();
            console.log("Invalid option, please try again")
    }
}