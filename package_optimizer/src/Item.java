
public class Item {

	int index_number;
	float weight;
	int cost;
	float cost_weight;
	
	Item(int parameter, Float weight, int cost)
	{
		this.index_number=parameter;
		this.weight=weight;
		this.cost=cost;
		this.cost_weight=cost/weight;
	}
	int getIndexNumber()
	{
		return index_number;
	}
	Float getWeight()
	{
		return  weight;
	}
	int getCost()
	{
		return cost;
	}
	float getcost_weight()
	{
		return cost_weight; 
	}
}
