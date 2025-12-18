package com.honestwy.adminback.repositorie;

import com.google.cloud.firestore.*;
import com.honestwy.adminback.dto.PrecioOficial;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PrecioOficialRepository {

    private final Firestore firestore;
    private static final String COLLECTION = "precios_oficiales";

    public PrecioOficialRepository(Firestore firestore) {
        this.firestore = firestore;
    }

    public void save(PrecioOficial precio) {
        firestore.collection(COLLECTION)
                .document(precio.getId())
                .set(precio);
    }

    public List<PrecioOficial> findAll() throws Exception {
        return firestore.collection(COLLECTION)
                .get()
                .get()
                .getDocuments()
                .stream()
                .map(doc -> doc.toObject(PrecioOficial.class))
                .toList();
    }

    public void update(String id, Map<String, Object> fields) {
        firestore.collection(COLLECTION)
                .document(id)
                .update(fields);
    }

    public void delete(String id) {
        firestore.collection(COLLECTION).document(id).delete();
    }
}
