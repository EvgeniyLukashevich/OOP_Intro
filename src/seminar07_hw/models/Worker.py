from models.Division import Division
from models.Position import Position


class Worker_Builder:
    _full_name: str
    _date_of_birth: str = "Неизвестно"
    _division: Division
    _position: Position
    _salary: int

    def __init__(self, full_name: str):
        self._full_name = full_name
        self._date_of_birth = "Неизвестно"
        self._division = Division()
        self._position = Position()
        self._salary = 11000

    def set_full_name(self, full_name: str):
        self._full_name = full_name
        return self

    def set_date_of_birth(self, date_of_birth: str):
        self._date_of_birth = date_of_birth
        return self

    def set_division(self, division: str):
        self._division.set_division(division)
        return self

    def set_position(self, position: str):
        self._position.set_position(position)
        return self

    def set_salary(self, salary: int):
        self._salary = salary
        return self

    def build(self):
        return Worker(self)


class Worker:
    __full_name: str
    __date_of_birth: str
    __division: Division
    __position: Position
    __salary: int

    def __init__(self, worker_builder: Worker_Builder):
        self.__full_name = worker_builder._full_name
        self.__date_of_birth = worker_builder._date_of_birth
        self.__division = worker_builder._division
        self.__position = worker_builder._position
        self.__salary = worker_builder._salary

    def get_worker_list(self):
        return [self.get_full_name(),
                self.get_date_of_birth(),
                self.get_division(),
                self.get_position(),
                self.get_salary()]

    def get_full_name(self):
        return self.__full_name

    def get_date_of_birth(self):
        return self.__date_of_birth

    def get_division(self):
        return self.__division.get_division()

    def get_position(self):
        return self.__position.get_position()

    def get_salary(self):
        return self.__salary

    # def get_info:
    #
