package defpackage;

import android.util.Property;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hhi implements View.OnClickListener {
    private final /* synthetic */ int a;

    public /* synthetic */ hhi(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                Property property = hmh.af;
                return;
            }
            return;
        }
        AddAccountActivity.a(view);
    }
}
