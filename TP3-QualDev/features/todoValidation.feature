Feature: Validating a TODO list
    To maintain consistency in task formatting, we validate a TODO list.

    Scenario: Every task starts with a capital letter
        Given A TODO list file "todo.txt"
        Then Each task should start with a capital letter

    Scenario: Every task ends with a period
        Given A TODO list file "todo.txt"
        Then Each task should end with a period

    Scenario: Adding a new task
        Given A TODO list file "todo.txt"
        When I add a new task "New Task."
        Then Each task should start with a capital letter and end with a period