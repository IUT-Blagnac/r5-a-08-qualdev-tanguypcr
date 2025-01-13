import os
from behave import given, then, when

@given('A TODO list file "{file_path}"')
def step_given_todo_list_file(context, file_path):
    assert os.path.isfile(file_path), f"TODO list file '{file_path}' does not exist."
    with open(file_path, 'r') as file:
        context.todo_list = file.readlines()

@when('I add a new task "{task}"')
def step_when_add_new_task(context, task):
    context.todo_list.append(task + '\n')

@then('Each task should start with a capital letter')
def step_then_tasks_start_with_capital(context):
    for line in context.todo_list:
        task = line.strip()
        if not task:  
            continue
        assert task[0].isupper(), f"Task does not start with a capital letter: '{task}'"

@then('Each task should end with a period')
def step_then_tasks_end_with_period(context):
    for line in context.todo_list:
        task = line.strip()
        if not task: 
            continue
        assert task.endswith('.'), f"Task does not end with a period: '{task}'"

@then('Each task should start with a capital letter and end with a period')
def step_then_tasks_start_with_capital_and_end_with_period(context):
    for line in context.todo_list:
        task = line.strip()
        if not task:  
            continue
        assert task[0].isupper(), f"Task does not start with a capital letter: '{task}'"
        assert task.endswith('.'), f"Task does not end with a period: '{task}'"