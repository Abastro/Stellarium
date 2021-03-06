package stellarium.objs.mv.additive;

import sciapi.api.value.euclidian.EVector;
import stellarium.catalog.EnumCatalogType;
import stellarium.mech.Wavelength;
import stellarium.objs.EnumSObjType;
import stellarium.objs.IStellarObj;
import stellarium.objs.mv.CMvEntry;
import stellarium.objs.mv.cbody.ICBodyType;
import stellarium.util.math.SpCoord;
import stellarium.view.ViewPoint;

/**Celestial Additive like Rings.*/
public abstract class CAdditive implements IStellarObj {
	
	protected CMvEntry entry;
	
	public CAdditive(CMvEntry e)
	{
		entry = e;
	}
	
	public CMvEntry getEntry()
	{
		return entry;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EVector getPos(ViewPoint vp, double partime) {
		return entry.cbody().getPos(vp, partime);
	}

	@Override
	public double getRadius(Wavelength wl) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMag(ViewPoint vp, double partime, Wavelength wl) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRenderId() {
		return entry.getMain().renderId;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EnumSObjType getType() {
		return EnumSObjType.Additive;
	}

	abstract public ICAdditiveType getAdditiveType();
	
}
