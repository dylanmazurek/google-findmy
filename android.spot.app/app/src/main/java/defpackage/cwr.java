package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwr implements cwo {
    public final cih a;
    public final chl b;
    public final cio c;

    public cwr(cih cihVar) {
        this.a = cihVar;
        this.b = new cwp(cihVar);
        this.c = new cwq(cihVar);
    }

    @Override // defpackage.cwo
    public final List a(String str) {
        cin a = cin.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
