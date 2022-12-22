def solution(s):
    s = s.lower().replace(' ', '')
    return s == s[::-1]


solution ("Anita lava la tina")
