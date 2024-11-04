package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvc implements cva {
    private final cih a;
    private final chl b;

    public cvc(cih cihVar) {
        this.a = cihVar;
        this.b = new cvb(cihVar);
    }

    @Override // defpackage.cva
    public final Long a(String str) {
        cin a = cin.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.g(1, str);
        this.a.l();
        Cursor c = bwp.c(this.a, a);
        try {
            Long l = null;
            if (c.moveToFirst() && !c.isNull(0)) {
                l = Long.valueOf(c.getLong(0));
            }
            return l;
        } finally {
            c.close();
            a.j();
        }
    }

    @Override // defpackage.cva
    public final void b(cuz cuzVar) {
        this.a.l();
        this.a.m();
        try {
            this.b.b(cuzVar);
            this.a.p();
        } finally {
            this.a.n();
        }
    }
}
