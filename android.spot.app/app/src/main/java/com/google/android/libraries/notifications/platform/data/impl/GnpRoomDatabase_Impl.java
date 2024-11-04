package com.google.android.libraries.notifications.platform.data.impl;

import defpackage.cht;
import defpackage.cih;
import defpackage.cij;
import defpackage.gob;
import defpackage.goc;
import defpackage.god;
import defpackage.goe;
import defpackage.gof;
import defpackage.gog;
import defpackage.goh;
import defpackage.gok;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GnpRoomDatabase_Impl extends GnpRoomDatabase {
    private volatile gok j;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final cht a() {
        return new cht(this, new HashMap(0), new HashMap(0), "gnp_accounts");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final /* synthetic */ cij c() {
        return new goh(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final Map h() {
        HashMap hashMap = new HashMap();
        hashMap.put(gok.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.cih
    public final Set i() {
        return new HashSet();
    }

    @Override // defpackage.cih
    public final List t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gob());
        arrayList.add(new goc());
        arrayList.add(new god());
        arrayList.add(new goe());
        arrayList.add(new gof());
        arrayList.add(new gog());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.data.impl.GnpRoomDatabase
    public final gok w() {
        gok gokVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new gok((cih) this);
            }
            gokVar = this.j;
        }
        return gokVar;
    }
}
