package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuy implements cuw {
    public final cih a;
    public final chl b;

    public cuy(cih cihVar) {
        this.a = cihVar;
        this.b = new cux(cihVar);
    }

    @Override // defpackage.cuw
    public final List a(String str) {
        cin a = cin.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        a.g(1, str);
        this.a.l();
        Cursor c = bwp.c(this.a, a);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                arrayList.add(c.getString(0));
            }
            return arrayList;
        } finally {
            c.close();
            a.j();
        }
    }
}
