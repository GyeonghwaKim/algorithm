def solution(before, after):
    before=sorted(before)
    after=sorted(after)
    if before==after:
        return 1
    return 0