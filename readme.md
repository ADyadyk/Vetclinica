**Какие проблемы при таком проектировании я увидел?**
<br/>
<br/>Проблема заключается в следующем:
<br/>Для каждого вида животных необходимо в классах,
созданных для них переопределять методы, с которыми
связаны действия вызывающие у них трудности (например, у рыб
трудности с тем чтобы летать и ходить).
<br/>
<br/>По моему мненю, можно разбить животных на группы в
зависимости от их возможностей выполнять какие-то действия.
Для этих групп создать свои классы наследники класса Animal
где переопределить методы один раз. А отдельные классы,
непосредственно созданные под конкретных животных, сделать
наследниками от классов конкретных групп.