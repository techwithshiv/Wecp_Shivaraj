package com.wecp.progressive.dao;

<<<<<<< HEAD
public class CricketerDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Cricketer;

public class CricketerDAOImpl implements CricketerDAO {

    @Override
    public int addCricketer(Cricketer cricketer) {
        // TODO Auto-generated method stub
       return -1;
        // throw new UnsupportedOperationException("Unimplemented method 'addCricketer'");
    }

    @Override
    public Cricketer getCricketerById(int cricketerId) {
        // TODO Auto-generated method stub
        return null;
        
    }

    @Override
    public void updateCricketer(Cricketer cricketer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteCricketer(int cricketerId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCricketers'");
        return List.of();
    }

>>>>>>> a163731712386a9bcdffcb8f74c90a5d22c255d1

}
