package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hgi implements gyy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gyy
    public final void a(View view, Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                hia hiaVar = (hia) this.a;
                hiaVar.g(view);
                hiaVar.i(false);
                return;
            }
            hav.b(view, 501, obj, "https://www.google.com/policies/privacy");
            return;
        }
        hav.b(view, 504, obj, "https://myaccount.google.com/termsofservice");
    }
}
