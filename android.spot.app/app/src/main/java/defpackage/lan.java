package defpackage;

import android.os.AsyncTask;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lan extends AsyncTask {
    final /* synthetic */ lao a;

    public lan(lao laoVar) {
        this.a = laoVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Float[] fArr = (Float[]) objArr;
        lav lavVar = this.a.b;
        lavVar.a();
        try {
            float floatValue = fArr[0].floatValue();
            laq laqVar = lavVar.a;
            int i = (int) floatValue;
            Set c = ((lau) laqVar).c(i);
            int i2 = i + 1;
            if (((lau) laqVar).b.b(Integer.valueOf(i2)) == null) {
                ((lau) laqVar).c.execute(new lat((lau) laqVar, i2));
            }
            int i3 = i - 1;
            if (((lau) laqVar).b.b(Integer.valueOf(i3)) == null) {
                ((lau) laqVar).c.execute(new lat((lau) laqVar, i3));
            }
            return c;
        } finally {
            lavVar.b();
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.a.g((Set) obj);
    }
}
