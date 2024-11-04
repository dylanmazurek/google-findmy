package com.google.android.libraries.notifications.internal.storage.impl.room;

import defpackage.cht;
import defpackage.cij;
import defpackage.gld;
import defpackage.gle;
import defpackage.gli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase {
    private volatile gle j;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final cht a() {
        return new cht(this, new HashMap(0), new HashMap(0), "chime_thread_states");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final /* synthetic */ cij c() {
        return new gld(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final Map h() {
        HashMap hashMap = new HashMap();
        hashMap.put(gle.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.cih
    public final Set i() {
        return new HashSet();
    }

    @Override // defpackage.cih
    public final List t() {
        return new ArrayList();
    }

    @Override // com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase
    public final gle w() {
        gle gleVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new gli(this);
            }
            gleVar = this.j;
        }
        return gleVar;
    }
}
