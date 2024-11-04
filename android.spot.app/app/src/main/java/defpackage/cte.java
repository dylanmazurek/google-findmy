package defpackage;

import android.app.job.JobParameters;
import android.database.Cursor;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cte {
    public static Network a(JobParameters jobParameters) {
        Network network;
        network = jobParameters.getNetwork();
        return network;
    }

    public static cve b(cvf cvfVar, cvk cvkVar) {
        cve cveVar;
        cin a = cin.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        a.g(1, cvkVar.a);
        a.e(2, cvkVar.b);
        cvj cvjVar = (cvj) cvfVar;
        cvjVar.a.l();
        Cursor c = bwp.c(cvjVar.a, a);
        try {
            int d = bwj.d(c, "work_spec_id");
            int d2 = bwj.d(c, "generation");
            int d3 = bwj.d(c, "system_id");
            if (c.moveToFirst()) {
                cveVar = new cve(c.getString(d), c.getInt(d2), c.getInt(d3));
            } else {
                cveVar = null;
            }
            return cveVar;
        } finally {
            c.close();
            a.j();
        }
    }
}
