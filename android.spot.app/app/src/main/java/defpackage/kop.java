package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kop implements knv {
    public final Set a;
    public final knv b;
    private final Set c;
    private final Set d;

    public kop(knu knuVar, knv knvVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (koc kocVar : knuVar.c) {
            if (kocVar.a()) {
                if (kocVar.b()) {
                    hashSet4.add(kocVar.a);
                } else {
                    hashSet.add(kocVar.a);
                }
            } else if (kocVar.b()) {
                hashSet5.add(kocVar.a);
            } else {
                hashSet2.add(kocVar.a);
            }
        }
        if (!knuVar.g.isEmpty()) {
            hashSet.add(new kon(kom.class, kqe.class));
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
        this.d = DesugarCollections.unmodifiableSet(hashSet2);
        DesugarCollections.unmodifiableSet(hashSet3);
        this.a = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        Set set = knuVar.g;
        this.b = knvVar;
    }

    @Override // defpackage.knv
    public final kqz a(kon konVar) {
        throw null;
    }

    @Override // defpackage.knv
    public final kqz b(Class cls) {
        kon konVar = new kon(kom.class, cls);
        if (this.d.contains(konVar)) {
            return this.b.a(konVar);
        }
        throw new koe(String.format("Attempting to request an undeclared dependency Provider<%s>.", konVar));
    }

    @Override // defpackage.knv
    public final kqz c(kon konVar) {
        throw null;
    }

    @Override // defpackage.knv
    public final Object d(kon konVar) {
        if (this.c.contains(konVar)) {
            return kne.k(this.b, konVar);
        }
        throw new koe(String.format("Attempting to request an undeclared dependency %s.", konVar));
    }

    @Override // defpackage.knv
    public final Object e(Class cls) {
        if (this.c.contains(new kon(kom.class, cls))) {
            Object l = kne.l(this.b, cls);
            if (!cls.equals(kqe.class)) {
                return l;
            }
            return new koo();
        }
        throw new koe(String.format("Attempting to request an undeclared dependency %s.", cls));
    }
}
