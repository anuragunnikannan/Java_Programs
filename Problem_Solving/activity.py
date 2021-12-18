def getMedian(freq, d, mid):
    count = 0
    pos = 0
    while count < mid:
        count += freq[pos]
        pos += 1
    pos -= 1
    if count > mid or d%2 != 0:
        return pos
    else:
        return (2*pos + 1)/2
    

def activity_notif(arr, d):
    freq = [0]*201
    end = d
    for i in range(end):
        freq[arr[i]] += 1
    alert = 0
    if d % 2 == 0:
        mid = int(d/2)
    else:
        mid = int(d/2) + 1
    current = 0
    while end < len(arr):
        median = getMedian(freq, d, mid)
        if arr[end] >= 2*median:
            alert += 1
        freq[arr[current]] -= 1
        freq[arr[end]] += 1
        current += 1
        end += 1
    return alert


t = [int(x) for x in input().split()]
n = t[0]
d = t[1]
arr = [int (x) for x in input().split()]
print(activity_notif(arr, d))