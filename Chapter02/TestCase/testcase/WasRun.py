from testcase.TestCase import TestCase


class WasRun(TestCase):

    def __init__(self, name):
        self.was_run = None
        self.was_setup = None
        TestCase.__init__(self, name)

    def setup(self):
        self.was_run = None
        self.was_setup = 1

    def test_method(self):
        self.was_run = 1