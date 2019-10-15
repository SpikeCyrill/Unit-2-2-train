<h3>Общая информация</h3>
<color=red>!Внимание!</color> в приложении созданы и используются перечисления с теми же названиями, что и в базовых пакетах!
<p>Будьте осторожны и проверяйте что импортируете типы из пакета <bold>com.brunoyam.unit_6.calendar.enums</bold></p>

<h3>Уровень 1</h3>
<p>В пакете com.brunoyam.unit_6.army добавить интерфейс Shootable с методом getShot с одним параметром типа int.
Имплементировать его классам 
com.brunoyam.unit_6.army.humans.Medic
com.brunoyam.unit_6.army.humans.Sniper
com.brunoyam.unit_6.army.humans.Trooper
com.brunoyam.unit_6.army.machines.Transport</p>

<p>В пакете com.brunoyam.unit_6.army добавить интерфейс Shooter с методом shoot с одним параметром типа Shootable.
Имплементировать его классам 
com.brunoyam.unit_6.army.humans.Sniper
com.brunoyam.unit_6.army.humans.Trooper
com.brunoyam.unit_6.army.machines.Tank</p>

<h3>Уровень 2</h3>
<p>
Добавить абстрактный класс com.brunoyam.unit_6.army.AbstractUnit с полем health типа int.
Сделать его родителем для всех классов пакета com.brunoyam.unit_6.army.</p>

<p>В методе getShot всех классов, имплементирующих интерфейс shootable, уменьшать значение поля health на величину, переданную в параметре.</p>
<p>В методе shoot всех классов, инмлементирующих интерфейс Shooter, вызывать метод getShot переданного объекта передавая ему произвольное значение.</p>

<h3>Уровень 3</h3>
<p>Доработать класс com.brunoyam.unit_6.calendar.Calendar</p>

<p>Добавить конструктор с одним параметром firstDay типа com.brunoyam.unit_6.calendar.enums.DayOfWeek.
Устанавливать значение поля firstDay в конструкторе.</p>

<p>Добавить метод, определяющий по номеру дня какой это день недели (понедельник, вторник, .....).</p>

<p>Добавить метод, определяющий по номеру дня сезон, месяц и день недели, и возвращающий строку вида
"сезон + месяц + число + день недели" в нижнем регистре на разных языках, в зависимости от переданного значения.
Например, для дня 33:</p>
<p>"зима февраль 2 понедельник"</p>
<p>"winter february 2 monday"</p>




