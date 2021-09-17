import datetime
from SearchApplication import SearchApplication

test = SearchApplication()

search = input("Enter the keyword to be searched")
if (datetime.now().minute <= 15) :
    # search in cache
    test.search_in_cache(search)
else :
    test.logs_containing_specific_word(search)

search.close_resources()