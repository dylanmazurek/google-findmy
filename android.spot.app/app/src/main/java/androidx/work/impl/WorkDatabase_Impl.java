package androidx.work.impl;

import defpackage.bzl;
import defpackage.chj;
import defpackage.cht;
import defpackage.cim;
import defpackage.ckg;
import defpackage.crq;
import defpackage.crr;
import defpackage.crs;
import defpackage.crt;
import defpackage.cru;
import defpackage.crv;
import defpackage.crw;
import defpackage.crx;
import defpackage.cry;
import defpackage.cuw;
import defpackage.cuy;
import defpackage.cva;
import defpackage.cvc;
import defpackage.cvd;
import defpackage.cvf;
import defpackage.cvj;
import defpackage.cvl;
import defpackage.cvn;
import defpackage.cvo;
import defpackage.cvs;
import defpackage.cvv;
import defpackage.cwn;
import defpackage.cwo;
import defpackage.cwr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile cvv j;
    private volatile cuw k;
    private volatile cwo l;
    private volatile cvf m;
    private volatile cvl n;
    private volatile cvo o;
    private volatile cva p;

    @Override // androidx.work.impl.WorkDatabase
    public final cvo A() {
        cvo cvoVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new cvs(this);
            }
            cvoVar = this.o;
        }
        return cvoVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cvv B() {
        cvv cvvVar;
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new cwn(this);
            }
            cvvVar = this.j;
        }
        return cvvVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cwo C() {
        cwo cwoVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new cwr(this);
            }
            cwoVar = this.l;
        }
        return cwoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final cht a() {
        return new cht(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.cih
    public final ckg d(chj chjVar) {
        return chjVar.c.a(bzl.e(chjVar.a, chjVar.b, new cim(chjVar, new cry(this)), false, false));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cih
    public final Map h() {
        HashMap hashMap = new HashMap();
        hashMap.put(cvv.class, Collections.emptyList());
        hashMap.put(cuw.class, Collections.emptyList());
        hashMap.put(cwo.class, Collections.emptyList());
        hashMap.put(cvf.class, Collections.emptyList());
        hashMap.put(cvl.class, Collections.emptyList());
        hashMap.put(cvo.class, Collections.emptyList());
        hashMap.put(cva.class, Collections.emptyList());
        hashMap.put(cvd.class, Collections.emptyList());
        return hashMap;
    }

    @Override // defpackage.cih
    public final Set i() {
        return new HashSet();
    }

    @Override // defpackage.cih
    public final List t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new crq());
        arrayList.add(new crr());
        arrayList.add(new crs());
        arrayList.add(new crt());
        arrayList.add(new cru());
        arrayList.add(new crv());
        arrayList.add(new crw());
        arrayList.add(new crx());
        return arrayList;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cuw w() {
        cuw cuwVar;
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new cuy(this);
            }
            cuwVar = this.k;
        }
        return cuwVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cva x() {
        cva cvaVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new cvc(this);
            }
            cvaVar = this.p;
        }
        return cvaVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cvf y() {
        cvf cvfVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new cvj(this);
            }
            cvfVar = this.m;
        }
        return cvfVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final cvl z() {
        cvl cvlVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new cvn(this);
            }
            cvlVar = this.n;
        }
        return cvlVar;
    }
}
