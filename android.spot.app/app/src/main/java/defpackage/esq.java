package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esq extends esn {
    public static final jnk af = jnk.l("com/google/android/apps/adm/integrations/spot/ringingvolume/SelectRingingVolumeDialogFragment");
    public esr ag;
    public ehr ah;
    private RadioGroup ai;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        View inflate = F().getLayoutInflater().inflate(R.layout.dialog_select_ringing_volume, (ViewGroup) null);
        this.ag = esr.e(D());
        this.ai = (RadioGroup) inflate.findViewById(R.id.ring_volume_radio_group);
        eso esoVar = (eso) this.ag.a().d();
        esoVar.getClass();
        int ordinal = esoVar.c.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        this.ai.check(R.id.radio_button_high);
                    }
                } else {
                    this.ai.check(R.id.radio_button_medium);
                }
            } else {
                this.ai.check(R.id.radio_button_low);
            }
        } else {
            this.ai.check(R.id.radio_button_default);
        }
        this.ai.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: esp
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                kzl kzlVar;
                esq esqVar = esq.this;
                if (i == R.id.radio_button_low) {
                    kzlVar = kzl.RINGING_VOLUME_LOW;
                } else if (i == R.id.radio_button_medium) {
                    kzlVar = kzl.RINGING_VOLUME_MEDIUM;
                } else if (i == R.id.radio_button_high) {
                    kzlVar = kzl.RINGING_VOLUME_HIGH;
                } else if (i == R.id.radio_button_default) {
                    kzlVar = kzl.RINGING_VOLUME_DEFAULT;
                } else {
                    ((jni) ((jni) esq.af.g()).j("com/google/android/apps/adm/integrations/spot/ringingvolume/SelectRingingVolumeDialogFragment", "onSelectedVolume", 81, "SelectRingingVolumeDialogFragment.java")).r("Unexpected ringing volume selected");
                    esqVar.d();
                    return;
                }
                esr esrVar = esqVar.ag;
                ehr ehrVar = esqVar.ah;
                hwx.V(esrVar.b.g(), "Use SpotRingingViewModel.get() to initialize the ViewModel.");
                if (!((Boolean) esrVar.b.c()).booleanValue()) {
                    esrVar.a = jer.i(kzlVar);
                    esrVar.c.l(esrVar.b());
                } else {
                    esrVar.c.l(esrVar.d(true));
                    jer g = ehrVar.g();
                    if (g.g() && (g.c() instanceof ekc)) {
                        ((ekc) g.c()).e(new eka(kzlVar, 5), new eta(esrVar, 1), R.string.spot_device_details_update_ring_volume_failed);
                    }
                }
                esqVar.d();
            }
        });
        iqd iqdVar = new iqd(F());
        iqdVar.t(inflate);
        return iqdVar.b();
    }
}
