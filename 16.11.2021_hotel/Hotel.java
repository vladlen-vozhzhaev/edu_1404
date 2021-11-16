public class Hotel {
    private Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }
    public void getFreeRooms(){
        String result = "По данному запросу найдены комнаты: ";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if(!room.isReserved())
                result += room.getRommNumber()+", ";
        }
        System.out.println(result);
    }

    public void getFreeRooms(boolean wc, int sleepingPlace, boolean conditioner, boolean wifi, int serviceCount){
        String result = "По данному запросу найдены комнаты: ";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            int mark = 0;
            if(wc && room.isWc()) mark++;
            if(sleepingPlace != 0 && room.getSleepingPlace()==sleepingPlace) mark++;
            if(conditioner && room.isConditioner()) mark++;
            if(wifi && room.isWifi()) mark++;
            if(serviceCount == mark && !room.isReserved())
                result += room.getRommNumber()+", ";

        }
        System.out.println(result);
    }

    public void reserve(int roomNumber){
        String result = "Ошибка: номер не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if(room.getRommNumber() == roomNumber && !room.isReserved()){
                result = "Номер "+roomNumber+" успешно забронирован";
                room.setReserved(true);
                break;
            }else if(room.getRommNumber() == roomNumber && room.isReserved()){
                result = "Номер "+roomNumber+" занят";
                break;
            }
        }
        System.out.println(result);
    }
    public void getReservedRooms(){
        String result = "Зарезервированные комнаты: ";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if(room.isReserved())
                result += room.getRommNumber()+", ";
        }
        System.out.println(result);
    }

}
