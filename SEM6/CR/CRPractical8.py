import random

def GameSim(Sims):
    wins_or_Losses = []
    
    for _ in range(Sims):
        Win_val = 0
        heads_in_row = 0
        
        while True:
            if(random.choice(['Y', 'N']) == 'Y'):
                if(random.choice(['Heads', 'Tails']) == 'Heads'):
                    heads_in_row += 1
                    Win_val += 2 ** heads_in_row
                # print(Win_val)
                else:
                    Win_val = 0
            else:
                break
        
        wins_or_Losses.append(Win_val)
    
    # print(wins_or_Losses)
    return wins_or_Losses

Sim = 10000000
print(sum(GameSim(Sim)) / Sim)