package defpackage;

import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enz extends enu {
    public BidiFormatter af;

    @Override // defpackage.ag
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String string = A().getString("owner_email");
        string.getClass();
        boolean z = A().getBoolean("approved_pending_owner");
        int i2 = 0;
        View inflate = layoutInflater.inflate(R.layout.owner_details_bottom_sheet, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.owner_title)).setText(this.af.unicodeWrap(string));
        View findViewById = inflate.findViewById(R.id.sharing_is_being_initiated);
        if (true != z) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        TextView textView = (TextView) inflate.findViewById(R.id.remove);
        textView.setOnClickListener(new ecp(this, string, 3, null));
        if (true != z) {
            i = R.string.remove_shared_owner;
        } else {
            i = R.string.remove_pending_shared_owner;
        }
        textView.setText(i);
        return inflate;
    }
}
