package com.google.android.libraries.onegoogle.accountmenu.cards.db;

import defpackage.cht;
import defpackage.cij;
import defpackage.hdr;
import defpackage.hds;
import defpackage.hdt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CardsDatabase_Impl extends CardsDatabase {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final cht a() {
        return new cht(this, new HashMap(0), new HashMap(0), "StorageCardDecorationState", "BackupSyncCardDecorationState");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final /* synthetic */ cij c() {
        return new hds(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final Map h() {
        HashMap hashMap = new HashMap();
        hashMap.put(hdt.class, Collections.emptyList());
        hashMap.put(hdr.class, Collections.emptyList());
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
}
