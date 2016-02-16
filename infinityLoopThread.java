        //import android.os.Handler;
        
        thread=new Thread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"the toast no:"+ i++,Toast.LENGTH_LONG).show();

                try {
                    thread.sleep(1000);
                    handler.postDelayed(this, 5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        });
        thread.run();
