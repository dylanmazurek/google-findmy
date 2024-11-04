package defpackage;

import android.accounts.Account;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkp {
    public final Account a;
    public final Set b;
    public final Set c;
    public final String d;
    public final String e;
    public final fxb f;
    public Integer g;
    private final Map h;

    public fkp(Account account, Set set, String str, String str2, fxb fxbVar) {
        Set unmodifiableSet;
        this.a = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = DesugarCollections.unmodifiableSet(set);
        }
        this.b = unmodifiableSet;
        Map emptyMap = Collections.emptyMap();
        this.h = emptyMap;
        this.d = str;
        this.e = str2;
        this.f = fxbVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = emptyMap.values().iterator();
        while (it.hasNext()) {
            Object obj = ((bym) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = DesugarCollections.unmodifiableSet(hashSet);
    }
}
