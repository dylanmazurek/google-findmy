package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hgj implements hak {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hak
    public final String a(String str) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((hia) this.a).getResources().getString(R.string.og_selected_account_a11y, str);
            }
            return ((hbf) this.a).b.getContext().getString(R.string.og_use_account_a11y_no_period, str);
        }
        return ((hgp) this.a).getContext().getString(R.string.og_signed_in_as_account, str);
    }
}
