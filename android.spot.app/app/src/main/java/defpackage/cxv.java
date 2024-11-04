package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxv {
    public static final /* synthetic */ int a = 0;

    static {
        cqc.a("DiagnosticsWrkr");
    }

    public static final void a(cvl cvlVar, cwo cwoVar, cvf cvfVar, List list) {
        Integer num;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cvu cvuVar = (cvu) it.next();
            cve b = cte.b(cvfVar, cuv.b(cvuVar));
            if (b != null) {
                num = Integer.valueOf(b.c);
            } else {
                num = null;
            }
            String str = cvuVar.b;
            cin a2 = cin.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            a2.g(1, str);
            cvn cvnVar = (cvn) cvlVar;
            cvnVar.a.l();
            Cursor c = bwp.c(cvnVar.a, a2);
            try {
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    arrayList.add(c.getString(0));
                }
                c.close();
                a2.j();
                mkm.ar(arrayList, ",", null, null, null, 62);
                mkm.ar(cwoVar.a(cvuVar.b), ",", null, null, null, 62);
                String str2 = cvuVar.b;
                String str3 = cvuVar.c;
                Objects.toString(num);
                int i = cvuVar.w;
                bpe.g(i);
                if (i == 0) {
                    throw null;
                }
            } catch (Throwable th) {
                c.close();
                a2.j();
                throw th;
            }
        }
    }
}
