package org.demo;

import java.util.*;

class Worker {

    private String id;

    private String name;

    private String position;

    public Worker(String id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Worker(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(id, worker.id) &&
                Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Worker{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

public class MapDemo {

    public static void main(String[] args) {
        Map workerStore = new HashMap();

        Worker worker1 = new Worker("1", "Iivanov I.", "test1");
        Worker worker2 = new Worker("2", "Petrov P.", "test2");

        workerStore.put(worker1, worker1);
        workerStore.put(worker2, worker2);

        Worker worker3 = new Worker("1", "Sidorov.", "test3");
        workerStore.put(worker3, worker3); //

        Worker worker33 = (Worker) workerStore.get(worker3);
        Worker worker333 = (Worker) workerStore.get(new Worker("1", "Sidorov."));
        System.out.println(worker333);

        workerStore.keySet().iterator();

        ///LinkedHashMap
        Map linkedMap = new LinkedHashMap();
        linkedMap.put("1", "2");
        linkedMap.put("3", "4");
        linkedMap.put("2", "3");
        linkedMap.put("3", "5");

        for (Object key: linkedMap.keySet()) {
            System.out.println("Key from linked map " + key + " value " + linkedMap.get(key));
        }

        //TreeMap
        Map  treeMap = new TreeMap();
        Comparable c;
        treeMap.put("2", "1");
        treeMap.put("1", "1");
        for (Object key: treeMap.keySet()) {
            System.out.println("Tree key is " + key);
        }

    }

}
