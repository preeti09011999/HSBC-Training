import pickle

global logPath 
logPath = "%SystemRoot%\System32\Winevt\Logs\Application.evtx"
class Logs :
    def __init__(self) :
        self.cfwrite = open("cache.data", "ab") #opening file in append mode
        self.cfread = open("cahce.data", "rb") # opening file in read mode
        self.lfwrite = open(logPath, "ab") #opening file in append mode
        self.lfread = open(logPath, "rb") # opening file in read mode


    def logs_containing_specific_word(self, search) :
        e = pickle.load(self.lfread)
        if e.query == search :
            return e

    def logs_for_given_date(self, date) :
        e = pickle.load(self.lfread)
        if e.date == date :
            return e


    def add_to_cache(self, search) :
        pickle.dump(search, self.cfwrite)

    def search_in_cache(self, search) :
        e = pickle.load(self.cfread)
        if e.query == search :
            return e

    def closeResources(self) :
        self.fwrite.close()
        self.fread.close()