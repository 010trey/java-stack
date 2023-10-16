from flask import Flask, render_template, request, redirect, session
import random
from datetime import datetime

app = Flask(__name__)
app.secret_key = 'ninja_gold_secret_key'

@app.route('/')
def index():
    if 'gold' not in session:
        session['gold'] = 0
        session['activities'] = []
    return render_template('index.html')

@app.route('/process_money', methods=['POST'])
def process_money():
    building = request.form['building']
    if building == 'farm':
        gold = random.randint(10, 20)
    elif building == 'cave':
        gold = random.randint(5, 10)
    elif building == 'house':
        gold = random.randint(2, 5)
    elif building == 'quest':
        gold = random.randint(-50, 50)
    elif building == 'spa':
        gold = -random.randint(5, 20)

    session['gold'] += gold
    timestamp = datetime.now().strftime("%Y/%m/%d %I:%M %p")
    if gold >= 0:
        message = f'Earned {gold} gold from the {building}! ({timestamp})'
    else:
        message = f'Entered a {building} and lost {abs(gold)} gold... Ouch... ({timestamp})'
    session['activities'].append(message)
    return redirect('/')

@app.route('/reset')
def reset():
    session.clear()
    return redirect('/')

if __name__ == '__main__':
    app.run(debug=True)
