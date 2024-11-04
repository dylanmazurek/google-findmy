package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbw extends AsyncTask {
    private final Context a;
    private final WeakReference b;

    public hbw(Context context, iwn iwnVar) {
        this.a = context.getApplicationContext();
        this.b = new WeakReference(iwnVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.a.getSharedPreferences("accountmenu.AccountSelectionRestorer.selectedAccount", 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, jei] */
    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SharedPreferences sharedPreferences = (SharedPreferences) obj;
        iwn iwnVar = (iwn) this.b.get();
        if (iwnVar != null) {
            if (iwnVar.c == null) {
                iwnVar.c = sharedPreferences;
            }
            ?? r1 = iwnVar.d;
            if (r1 != 0) {
                r1.a(sharedPreferences.getString("selected_account_id", null));
                iwnVar.d = null;
            }
        }
    }
}
